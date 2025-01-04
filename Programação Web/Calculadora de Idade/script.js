function calcularIdade() {
    const anoNascimento = parseInt(document.getElementById('anoNascimento').value);
    const anoAtual = new Date().getFullYear();
    const idade = anoAtual - anoNascimento;

    document.getElementById('resultadoIdade').innerText = `Sua idade é: ${idade} anos.`;
}
