console.log("Hello World!")
//Importing by common JS module method
const p = require('./index2')
const p1 = require('./index3')
const os = require('os')
const path = require('path')
const fs = require('fs')


//Using common JS modules
console.log(p.aalu)
p.baigan()
console.log(p1)

/*
console.log(os.totalmem())
console.log(os.freemem())
console.log(os.hostname())
console.log(os.type())
console.log(os.version())
console.log(os.uptime())
console.log(os.platform())
console.log(os.machine())
console.log(os.cpus())
console.log(os.homedir())
*/

//__filename is the current file which i am working on
//extension type ie js for this file
/* 
const a1=path.extname(__filename)
const a2=path.dirname(__filename)
console.log(a1)
console.log(a2)
 */
console.log("File opened")
//Will read a file after almost all codes or if the file is ready after the I/O operation
//Change to present directory to find the file
fs.readFile('FaltuNotes.txt','utf8',(err,data)=>{
    console.log(err,data)
})
//This will read the file and store it so that it can be used again
//But this will not print the string values
const z = fs.readFileSync('FaltuNotes.txt')
console.log(z)
//To print the string values use toString() method
console.log(z.toString())

fs.writeFile('FaltuNotes.txt',"Written data1",()=>{
    console.log("Written 1")
})
const y = fs.writeFileSync('FaltuNotes.txt',"Written data2")
console.log(y)
console.log("File closed and now normal readFile method will work")
