function checkPass() {
    const password = document.getElementById('password')
    const password2 = document.getElementById('password2')
    const message = document.getElementById('confirmMessage')

    if (password.value === password2.value) {
        message.style.color = "green";
        message.innerText = "Hasło prawidłowe"

    } else {
        message.style.color = "red";
        message.innerText = "Hasła różnia się od siebie"
    }
}

function confirmSendRemindMail() {
    const message = document.getElementById('confirmMessage');
    message.style.color = "green";
    message.innerText = "Wysyłam..."
}

function registration() {
    const message = document.getElementById('registrationMessage');
    message.style.color = "green";
    message.innerText = "Rejestracja..."
}

function dotPay() {
    const message = document.getElementById('registrationMessage');
    message.style.color = "green";
    message.innerText = "Przekierowywanie do DotPay"
}

