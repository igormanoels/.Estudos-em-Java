package edu.dio.desafio04.Lista5Desafios;

import java.util.Scanner;

public class B_VerifdeNumContaBancaria01 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        try 
        {
            String numeroConta = scanner.nextLine();

            verificarNumeroConta(numeroConta);
            
            System.out.println("Numero de conta valido.");
        } 
        catch (IllegalArgumentException e) 
        {
            System.out.println("Erro: " + e.getMessage());
        } 
        finally 
        {
            scanner.close();
        }
    }

    private static void verificarNumeroConta(String numeroConta) 
    {
        if (numeroConta.length() != 8) 
        {
        	throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
        }
    }
}
