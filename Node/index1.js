//Importing by ES6 moodule method
//But to use ES6 module, we have to set type in the package.json file to module
//This line will call the deafult module as brackets are not used
import hello from './index4.mjs';
import {hello1 as h1} from './index4.mjs'
hello()
h1()