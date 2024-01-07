# Basics of React
>All of these lines of code belong to me and is not copied from anywhere.You can use this as the way you want but copyright claim can be made if you use this repeatedly or for commercial use. <cite>*--Prince*</cite>
---
## Routing
**For Routing, react-router-dom must be installed -**
#### * $ npm i react-router-dom*
1. use createBrowserRouter
2. use path, element and children
2. using children can specify the exact path and subpath
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

## Connecting to Database
