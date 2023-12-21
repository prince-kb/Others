console.log("Hello World!")
const p = require('./index2')
const os = require('os')
const path = require('path')
const fs = require('fs')
//Using required files
// console.log(p)

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

fs.readFile('Notes.txt','utf8',(err,data)=>{
    console.log(err,data)
})
