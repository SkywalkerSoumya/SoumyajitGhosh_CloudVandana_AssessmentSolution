let displayValue = '';

function clearDisplay() {
  displayValue = '';
  updateDisplay();
}

function appendToDisplay(value) {
  displayValue += value;
  updateDisplay();
}

function calculateResult() {
  try {
    displayValue = eval(displayValue).toString();
    updateDisplay();
  } catch (error) {
    displayValue = 'Error';
    updateDisplay();
  }
}

function updateDisplay() {
  document.getElementById('display').value = displayValue;
}
