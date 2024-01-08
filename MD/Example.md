# Basics of React 
>All of these lines of code belong to me and is not copied from anywhere.You can use this as the way you want but copyright claim can be made if you use this repeatedly or for commercial use. <cite>*--Prince*</cite>
---

## **Points to remember**
- Connecting to a specific address needs two parameters
    1. The address ,
    1. Response and Request as arguments of second parameter and a function to handle these request and response (in second argument)

>Example
``` js
const express = require('express')
const app = express()

app.get('/about',(req,res)=>{
    res.send("Connection Successful")
})

```

## Routing
**For Routing, react-router-dom must be installed -**
#### * $ npm i react-router-dom*
1. use createBrowserRouter
2. use path, element and children
2. using children can specify the exact path and == subpath
4. using Outlet can let you freely use other react elements without reloading others

```js
import {createBrowserRouter, Outlet} from react-router-dom;
const router = createBrowserRouter([
    {
        path : '/',
        element : <YourElement/>,
        children : [
            {
                path : '/',
                element : <Home/>
            },
            {
                path : '/about',
                element : <About/>
            }
        ]
    },
    {
        path : '/signup',
        element : <Signup/>
    }
])

```
[Youtube](https://youtube.com)

## Connecting to Database
- [MongoDB Connection](#mongodb-connection)
- [Using express to create connection app](#express-and-port)
- Handling request and response
----

- [ ] JavaScript
- [x] React

## MongoDB Connection
#### Connect to Mongoose (*Using a seperate js file for connection is preferred*) and then export it and use in another js file  

## Code to show connection
### database.js
``` js
    const mongoose = require('mongoose')
    const URL = "https://mongodb_generated_address";

    const connectToMongo=()=>{
        mongoose.connect(URL,()=>{
            console.log("Connected to MongoDB successfully")
        })
    }
    module.exports = connectToMongo;

```

### index.js
``` js

const connectToMOngo = require('./database.js')
connectToMongo();


```
><details><Summary>OUTPUT</Summary>Connected to MongoDB successfully</details>
---
## Express and port
#### Use express to create app and get and listen to it by using request and response where necessary
>Example
``` js
const express = require('express')
const app = express()
const port = 3000

app.get('/',(req,res)=>{
    res.send("Hello world")
})

app.listen(port,()=>{
    console.log("Port listening on port: "+port);
})

```

### Tables in MD

| SNo      | Name      | Class      | Roll      |
| :------  | :--:      | ----:      | ---- |
| 0 | You | 2 | 56 |
|Left|Center|Right|nothing
 ---


![Image1](./qm2.png)