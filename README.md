<b>
    <h1 align="center"> JMP: Web Services </h1>
</b>

<p>Please, write Rest web services for User directory that provide CRUD operations on User.
<p>User information should contain at least: first name, last name, login and email.
<p>For creation of the user, please, use JSON format.
<p>Create also Rest service to upload and download user logo as Image.
<p>The application should be implemented and deploy on application server.
<p>You can use any Rest implementation (Jersey, Restlet, etc.).
<p>To test your application, please, use jersey Rest client that will cover all operations.
<p>User data can be saved anywhere, database is not required.

<b>
    <h2 align="center"> User interactions </h2>
</b>

<details>
    <summary> Get all users </summary>
    <p> Request: GET to <i>APPLICATION_URL/users</i>
    <p> Successful response example:
    <pre>
    HTTP Status 200 OK
    [
      {
        "id": "58ca5ea205a9822f906031f0",
        "forename": "Eugene",
        "surname": "Kortelyov",
        "email": "seymouriamorpha@gmail.com",
        "login": "seymouria",
        "image": "AQEBAQEBAQEAAQEAAAABAQEBAQEBAQEBAQAAAAAAAAEAAAAAAQAAAQABAAEAAAABAQABAAABAAABAQAAAAEBAAABAQAAAAEAAQAAAQEBAQEBAQEBAQABAQABAQABAAAAAAEBAAEAAAABAQABAQABAQEBAQABAAEBAAAAAQEBAQEBAQEBAQAAAQEAAAEBAAAAAQABAAEBAAABAAEAAAEBAAEBAQAAAQABAQEAAQEBAQAAAQEAAAEBAAABAAEAAAEBAQEBAQEAAQAAAQEBAAEBAQABAAEBAQEBAQEBAQABAQEAAQEBAAEAAQEBAAABAQEAAAEAAAAAAAEAAAEAAAEAAQEBAAEAAAEBAQEAAAAAAAEAAAABAAEAAQEAAAEAAAABAQEBAQAAAQEBAAABAAEAAAABAQABAQEBAAEAAAEBAAEBAAABAQAAAAABAQAAAAEBAQABAAABAQABAAABAQABAAABAQEBAQEAAAEBAQEBAQAAAQEBAQEAAQEBAQAAAAEBAAABAAEBAQEAAAEAAQEBAAEBAAABAQEBAAEAAAEBAAABAAEBAQEBAQEBAQEAAQEAAQEAAQAAAAABAQEBAAABAQAAAQEAAAEBAQAAAQABAQEBAAABAQAAAAEBAAEBAQABAQEAAAABAQAAAQABAAAAAAEBAQEAAAEAAAAAAQEBAAABAAEBAAABAAEBAAABAAEBAAABAAEBAAABAAEBAAABAAEBAAABAAEBAAABAAEBAAABAAEBAAABAAEBAAABAAEBAAABAAEBAAABAAEBAAABAAEBAA=="
      },
      {
        "id": "58ca679d05a9822b28653eda",
        "forename": "Siarhei",
        "surname": "Drabysheuski",
        "email": "sd@gmail.com",
        "login": "dres",
        "image": "AQEBAQEBAQEAAQEAAAABAQEBAQEBAQEBAQAAAAAAAAEAAAAAAQAAAQABAAEAAAABAQABAAABAAABAQAAAAEBAAABAQAAAAEAAQAAAQEBAQEBAQEBAQABAQABAQABAAAAAAEBAAEAAAABAQABAQABAQEBAQABAAEBAAAAAQEBAQEBAQEBAQAAAQEAAAEBAAAAAQABAAEBAAABAAEAAAEBAAEBAQAAAQABAQEAAQEBAQAAAQEAAAEBAAABAAEAAAEBAQEBAQEAAQAAAQEBAAEBAQABAAEBAQEBAQEBAQABAQEAAQEBAAEAAQEBAAABAQEAAAEAAAAAAAEAAAEAAAEAAQEBAAEAAAEBAQEAAAAAAAEAAAABAAEAAQEAAAEAAAABAQEBAQAAAQEBAAABAAEAAAABAQABAQEBAAEAAAEBAAEBAAABAQAAAAABAQAAAAEBAQABAAABAQABAAABAQABAAABAQEBAQEAAAEBAQEBAQAAAQEBAQEAAQEBAQAAAAEBAAABAAEBAQEAAAEAAQEBAAEBAAABAQEBAAEAAAEBAAABAAEBAQEBAQEBAQEAAQEAAQEAAQAAAAABAQEBAAABAQAAAQEAAAEBAQAAAQABAQEBAAABAQAAAAEBAAEBAQABAQEAAAABAQAAAQABAAAAAAEBAQEAAAEAAAAAAQEBAAABAAEBAAABAAEBAAABAAEBAAABAAEBAAABAAEBAAABAAEBAAABAAEBAAABAAEBAAABAAEBAAABAAEBAAABAAEBAAABAAEBAAABAAEBAAABAAEBAA=="
      }
    ]
    </pre>
</details>

<details>
    <summary> Get user by ID </summary>
    <p> Request: GET to <i>APPLICATION_URL/users/{id}</i>
    <p> Successful response example:
    <pre>
    {
        "id": "58ca679d05a9822b28653eda",
        "forename": "Siarhei",
        "surname": "Drabysheuski",
        "email": "sd@gmail.com",
        "login": "dres",
                "image": "AQEBAQEBAQEAAQEAAAABAQEBAQEBAQEBAQAAAAAAAAEAAAAAAQAAAQABAAEAAAABAQABAAABAAABAQAAAAEBAAABAQAAAAEAAQAAAQEBAQEBAQEBAQABAQABAQABAAAAAAEBAAEAAAABAQABAQABAQEBAQABAAEBAAAAAQEBAQEBAQEBAQAAAQEAAAEBAAAAAQABAAEBAAABAAEAAAEBAAEBAQAAAQABAQEAAQEBAQAAAQEAAAEBAAABAAEAAAEBAQEBAQEAAQAAAQEBAAEBAQABAAEBAQEBAQEBAQABAQEAAQEBAAEAAQEBAAABAQEAAAEAAAAAAAEAAAEAAAEAAQEBAAEAAAEBAQEAAAAAAAEAAAABAAEAAQEAAAEAAAABAQEBAQAAAQEBAAABAAEAAAABAQABAQEBAAEAAAEBAAEBAAABAQAAAAABAQAAAAEBAQABAAABAQABAAABAQABAAABAQEBAQEAAAEBAQEBAQAAAQEBAQEAAQEBAQAAAAEBAAABAAEBAQEAAAEAAQEBAAEBAAABAQEBAAEAAAEBAAABAAEBAQEBAQEBAQEAAQEAAQEAAQAAAAABAQEBAAABAQAAAQEAAAEBAQAAAQABAQEBAAABAQAAAAEBAAEBAQABAQEAAAABAQAAAQABAAAAAAEBAQEAAAEAAAAAAQEBAAABAAEBAAABAAEBAAABAAEBAAABAAEBAAABAAEBAAABAAEBAAABAAEBAAABAAEBAAABAAEBAAABAAEBAAABAAEBAAABAAEBAAABAAEBAAABAAEBAA=="
    }
    </pre>
</details>

<details>
    <summary> Create user </summary>
    <p> Request: POST to <i>APPLICATION_URL/users/</i>
    <p> Request example:
        <pre>
        {
            "forename": "Eugene",
            "surname": "Kortelyov",
            "email": "seymouriamorpha@gmail.com",
            "login": "seymouria",
            "image": [1,1,1,1,1,1,1,1,0,1,1,0,0,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,1,0,0,0,0,1,0,0,1,0,1,0,1,0,0,0,1,1,0,1,0,0,1,0,0,1,1,0,0,0,1,1,0,0,1,1,0,0,0,1,0,1,0,0,1,1,1,1,1,1,1,1,1,1,0,1,1,0,1,1,0,1,0,0,0,0,1,1,0,1,0,0,0,1,1,0,1,1,0,1,1,1,1,1,0,1,0,1,1,0,0,0,1,1,1,1,1,1,1,1,1,1,0,0,1,1,0,0,1,1,0,0,0,1,0,1,0,1,1,0,0,1,0,1,0,0,1,1,0,1,1,1,0,0,1,0,1,1,1,0,1,1,1,1,0,0,1,1,0,0,1,1,0,0,1,0,1,0,0,1,1,1,1,1,1,1,0,1,0,0,1,1,1,0,1,1,1,0,1,0,1,1,1,1,1,1,1,1,1,0,1,1,1,0,1,1,1,0,1,0,1,1,1,0,0,1,1,1,0,0,1,0,0,0,0,0,1,0,0,1,0,0,1,0,1,1,1,0,1,0,0,1,1,1,1,0,0,0,0,0,1,0,0,0,1,0,1,0,1,1,0,0,1,0,0,0,1,1,1,1,1,0,0,1,1,1,0,0,1,0,1,0,0,0,1,1,0,1,1,1,1,0,1,0,0,1,1,0,1,1,0,0,1,1,0,0,0,0,1,1,0,0,0,1,1,1,0,1,0,0,1,1,0,1,0,0,1,1,0,1,0,0,1,1,1,1,1,1,0,0,1,1,1,1,1,1,0,0,1,1,1,1,1,0,1,1,1,1,0,0,0,1,1,0,0,1,0,1,1,1,1,0,0,1,0,1,1,1,0,1,1,0,0,1,1,1,1,0,1,0,0,1,1,0,0,1,0,1,1,1,1,1,1,1,1,1,1,0,1,1,0,1,1,0,1,0,0,0,0,1,1,1,1,0,0,1,1,0,0,1,1,0,0,1,1,1,0,0,1,0,1,1,1,1,0,0,1,1,0,0,0,1,1,0,1,1,1,0,1,1,1,0,0,0,1,1,0,0,1,0,1,0,0,0,0,1,1,1,1,0,0,1,0,0,0,0,1,1,1,0,0,1,0,1,1,0,0,1,0,1,1,0,0,1,0,1,1,0,0,1,0,1,1,0,0,1,0,1,1,0,0,1,0,1,1,0,0,1,0,1,1,0,0,1,0,1,1,0,0,1,0,1,1,0,0,1,0,1,1,0,0,1,0,1,1,0,0,1,0,1,1,0,0,1,0,1,1,0,0,1,0,1,1,0]
        }
        </pre>
    <p> Successful response example:
    <pre>
    {
        HTTP Status: 201 CREATED
        "id": "58ca6a5105a982281c6d46d6",
        "forename": "Eugene",
        "surname": "Kortelyov",
        "email": "seymouriamorpha@gmail.com",
        "login": "seymouria",
        "image": "AQEBAQEBAQEAAQEAAAABAQEBAQEBAQEBAQAAAAAAAAEAAAAAAQAAAQABAAEAAAABAQABAAABAAABAQAAAAEBAAABAQAAAAEAAQAAAQEBAQEBAQEBAQABAQABAQABAAAAAAEBAAEAAAABAQABAQABAQEBAQABAAEBAAAAAQEBAQEBAQEBAQAAAQEAAAEBAAAAAQABAAEBAAABAAEAAAEBAAEBAQAAAQABAQEAAQEBAQAAAQEAAAEBAAABAAEAAAEBAQEBAQEAAQAAAQEBAAEBAQABAAEBAQEBAQEBAQABAQEAAQEBAAEAAQEBAAABAQEAAAEAAAAAAAEAAAEAAAEAAQEBAAEAAAEBAQEAAAAAAAEAAAABAAEAAQEAAAEAAAABAQEBAQAAAQEBAAABAAEAAAABAQABAQEBAAEAAAEBAAEBAAABAQAAAAABAQAAAAEBAQABAAABAQABAAABAQABAAABAQEBAQEAAAEBAQEBAQAAAQEBAQEAAQEBAQAAAAEBAAABAAEBAQEAAAEAAQEBAAEBAAABAQEBAAEAAAEBAAABAAEBAQEBAQEBAQEAAQEAAQEAAQAAAAABAQEBAAABAQAAAQEAAAEBAQAAAQABAQEBAAABAQAAAAEBAAEBAQABAQEAAAABAQAAAQABAAAAAAEBAQEAAAEAAAAAAQEBAAABAAEBAAABAAEBAAABAAEBAAABAAEBAAABAAEBAAABAAEBAAABAAEBAAABAAEBAAABAAEBAAABAAEBAAABAAEBAAABAAEBAAABAAEBAAABAAEBAA=="
    }
    </pre>
</details>

<details>
    <summary> Delete user </summary>
    <p> Request: DELETE to <i>APPLICATION_URL/users/{id}</i>
    <p> Successful response example:
        <pre>
        HTTP Status: 200
        </pre>
</details>

<details>
    <summary> Update user </summary>
    <p> Request : PATCH to <i>APPLICATION_URL/users/{id}</i>:
    <pre>
    {
        "id":"58ca6a5105a982281c6d46d6",
        "forename":"MaybeNewForename",
        "surname":"MaybeNewSurname",
        "email":"MaybeNewEmail@gmail.com",
        "image":"MaybeNewImage"
    }
    </pre>
    <p> Successful response example:
    <pre>
    HTTP Status: 200
    {
        "id":"58ca6a5105a982281c6d46d6",
        "forename":"MaybeNewForename",
        "surname":"MaybeNewSurname",
        "email":"MaybeNewEmail@gmail.com",
        "token":"MaybeNewImage"
    }
    </pre>
</details>