<form id="registrationForm" action="/login" method="post" class="form-signin">
    <h1 class="h3 mb-3 font-weight-normal">Logowanie</h1>
    <h2 class="alert-danger"> Nieprawidłowe dane </h2>
    <label for="username" class="sr-only">e-mail</label>
    <input id="username" name="username" type="text" class="form-control"
           placeholder="e-mail" required autofocus><br>
    <label for="password" class="sr-only">Hasło</label>
    <input id="password" name="password" type="password" class="form-control" placeholder="Hasło"
           required><br>
    <a href="/pay-forget-password">Zapomniałem hasła</a>
    <button class="btn btn-lg btn-block" type="submit">Logowanie</button>
</form>