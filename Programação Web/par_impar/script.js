function verificarParImpar() {
    const numero = parseInt(document.getElementById('numero').value);
    const resultado = numero % 2 === 0 ? 'par' : 'ímpar';

    document.getElementById('resultadoParImpar').innerText = `O número ${numero} é ${resultado}.`;
}
