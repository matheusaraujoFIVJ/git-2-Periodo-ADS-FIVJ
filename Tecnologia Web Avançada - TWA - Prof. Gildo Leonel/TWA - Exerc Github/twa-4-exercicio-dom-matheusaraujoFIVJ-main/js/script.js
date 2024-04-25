// twa-4-exercicio-dom-matheusaraujoFIVJ
/* 
Crie um arquivo html contendo:

Uma tag img vazia;
Um formuário com um input para a url de uma imagem e um botão exibir.


Crie um script javascript para:

Ao clicar no botão exibir a imagem cuja url foi inserida no formulário deverá aparecer na tela.*/

const imgForm = document.getElementById('imgForm');
const exibirBtn = document.getElementById('exibirBtn');

exibirBtn.addEventListener('click', function() {
 
    const imgUrl = document.getElementById('imgUrl').value;

    const imagemExibida = document.createElement('img');
    imgExibida.src = imgUrl;
    imgExibida.alt = 'ImgExibida';

    const imgContainer = document.getElementById('imgContainer');
    imgContainer.innerHTML = '';

    imgContainer.appendChild(imgExibida);
});