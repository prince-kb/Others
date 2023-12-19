const name=document.querySelector("#name")
const button=document.querySelector("button")
const form=document.querySelector("form")
const ull=document.querySelector("#ull")
const pressed=document.querySelector("#pressed")


button.addEventListener("click",function(n){

    //This will not let the webpage to reload or move to another website
    n.preventDefault();
    // console.log(name.value);
    const b=document.createElement("b");
    b.innerText=name.value;
    const LI=document.createElement("LI");
    LI.append(b);
    ull.append(LI);
    name.value="";

    //This will not let the button to be clicked twice if it falls under any other event
    n.stopPropagation();
});

ull.addEventListener("click",function(e){
    // e.target.remove();

    //Check if it has child of type LI and remove if it is true
    e.target.nodeName=== 'LI' && e.target.remove();
})
pressed.addEventListener("click",()=>{
    console.log("Clicked")
})
name.addEventListener("keyup",()=>{
    console.log("KEYUP")
})
name.addEventListener("keydown",()=>{
    console.log("KEYDOWN")
})
window.addEventListener("keydown",function(a){
    // console.log(a)
    switch(a.key){
        case 'Q':console.log("Q");
        console.log(a);
        break;
        case 'S':console.log("S");
        break;
        case 'A':console.log("A");
        break;
        case 'W':console.log("W");
        break;
        case 'E':console.log("E");
    }
    switch(a.code){
        case 'ShiftRight': console.log("ShiftRight");
    }


})