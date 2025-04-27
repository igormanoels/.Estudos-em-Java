const form = document.getElementById('formContato');

form.addEventListener('submit', async (e) => {
    e.preventDefault();

    const nome = document.getElementById('nome').value;
    const telefone = document.getElementById('telefone').value;

            await fetch('http://localhost:8080/contatos', {
                method: 'POST',
                headers: { 'Content-Type': 'application/json' },
                body: JSON.stringify({ nome, telefone })
            });

            form.reset();
            carregarContatos();
        });

        async function carregarContatos() {
            const resposta = await fetch('http://localhost:8080/contatos');
            const contatos = await resposta.json();
            const lista = document.getElementById('listaContatos');

            lista.innerHTML = '';

            contatos.forEach(contato => {
                const li = document.createElement('li');
                li.textContent = `Nome: ${contato.nome} | Telefone: ${contato.telefone}`;
                lista.appendChild(li);
            });
        }

        carregarContatos();