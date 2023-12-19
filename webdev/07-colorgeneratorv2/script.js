const container=document.querySelectorAll(".container")
const p=document.querySelectorAll("p")
const colorgenerator=()=>{
    let r=Math.floor(Math.random()*255);
    let g=Math.floor(Math.random()*255);
    let b=Math.floor(Math.random()*255);
    return `rgb(${r},${g},${b})`;
}

for(let c of container){
    c.addEventListener('click',()=>{
        let p1=c.firstElementChild;
        p1.style.color=colorgenerator();
        c.style.background=colorgenerator();
    })
}