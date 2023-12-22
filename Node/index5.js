//URL methods
import url from 'url'
console.log(url)
const myurl = new URL('http://google.com')
myurl.pathname="hii"
myurl.username="pkb"
myurl.password="pkb"
console.log(myurl)
console.log(myurl.hostname)