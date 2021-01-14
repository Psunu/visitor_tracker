const inputText = document.querySelector('.input_container input[type="text"]')
const ul = document.querySelector('ul')

inputText.addEventListener('keyup', checkEnter)

function checkEnter(event) {
    if (event.key === "Enter") {
        addVisitor()
    }
}

function addVisitor() {
    if (inputText.value === '') return

    // 현재 시간 객체 생성
    const now = new Date();
    // li element 생성
    const newLi = document.createElement('li')
    // text input의 text에 현재 time stamp를 더한 text node 생성
    const txt = document.createTextNode(inputText.value + ' ' + now.toLocaleTimeString())
    // 생성한 text node를 li element에 추가
    newLi.appendChild(txt)
    // li element를 ul에 추가
    ul.appendChild(newLi)
    // text input 초기화
    inputText.value = ''
}