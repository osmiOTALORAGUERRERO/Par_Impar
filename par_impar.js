let probar = document.getElementById('prueba')

probar.addEventListener('click', calcular, false)

function calcular (event) {
  let input = document.getElementById('number')
  let result = document.getElementById('result')
  let num = parseFloat(input.value)

  if (!isNaN(num)) {
    let arr = num.toString().split('.')
    if (arr.length === 1) {
      if (par(num)) {
        result.innerHTML = `El resultado de: ${num} es par`
      } else {
        result.innerHTML = `El resultado de: ${num} es impar`
      }
    } else if (arr.length === 2) {
      let strResult = ''
      if (par(arr[0])) {
        strResult += `${arr[0]} es par  &  `
      } else {
        strResult += `${arr[0]} es impar  &  `
      }
      if (par(arr[1])) {
        strResult += `.${arr[1]} es par  `
      } else {
        strResult += `.${arr[1]} es impar  `
      }
      result.innerHTML = `El resultado de: ${strResult}`
    }
  }
}

function par (num) {
  if (num % 2 === 0) {
    return true
  } else {
    return false
  }
}
