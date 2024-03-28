package controller;

import java.util.Random;

public class ThreadCavaleiro extends Thread {
    
    private String nome;
    private int minDistancia;
    private int maxDistancia;
    private boolean encontrouTocha;
    private boolean encontrouPedra;
    private boolean saiu;
    private int porta;
    private static Random random = new Random();
    private static int portaSemInimigo;
    private static int inimigoAleatorio;
    private static boolean inimigoCriado = false;
    
    public ThreadCavaleiro(String n, int mind, int maxd) {
        this.nome = n;
        this.minDistancia = mind;
        this.maxDistancia = maxd;
        this.encontrouTocha = false;
        this.encontrouPedra = false;
        this.saiu = false;
        this.porta = -1; 
    }
    
    public void run() 
    {
        int distancia = 0;
        try 
        {
            while (distancia < 2000 && !saiu) 
            { 
                int incremento = (int) (Math.random() * (maxDistancia - minDistancia + 1) + minDistancia);
                distancia += incremento;
                System.out.println(nome + " avançou " + incremento + "m. Distância total: " + distancia + "m");
                
                if (!encontrouTocha && distancia >= 500 && distancia < 1500) 
                { 
                    encontrouTocha = true;
                    System.out.println(nome + " encontrou a tocha!");
                    minDistancia += 2;
                    maxDistancia += 2;
                }
                
                if (!encontrouPedra && distancia >= 1500 && distancia < 2000) 
                { 
                	encontrouPedra = true;
                    System.out.println(nome + " encontrou a pedra brilhante!");
                    minDistancia += 2;
                    maxDistancia += 2;
                }
                
                Thread.sleep(50);
            }
            
            if (!saiu) 
            {
                porta = random.nextInt(4) + 1; 
                saiu = true;
                System.out.println(nome + " escolheu a porta " + porta);
            }
            
            
            if (!inimigoCriado) 
            {
                inimigoAleatorio = random.nextInt(3) + 1; 
                for (int i = 1; i <= 4; i++) 
                {
                    if (i != inimigoAleatorio) 
                    {
                        portaSemInimigo = i;
                        break;
                    }
                }
                inimigoCriado = true;
            }
            

            if (porta == portaSemInimigo) 
            {
                System.out.println(nome + " entrou na porta " + porta + " e sobreviveu! Não havia inimigo.");
            } 
            else 
            {
                System.out.println(nome + " entrou na porta " + porta + " e foi devorado pelo inimigo.");
            }
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
    }
    
    public boolean encontrouTocha() 
    {
        return encontrouTocha;
    }
    
    public boolean encontrouPedra() 
    {
        return encontrouPedra;
    }
    
    public int getPortaEscolhida() 
    {
        return porta;
    }
}
