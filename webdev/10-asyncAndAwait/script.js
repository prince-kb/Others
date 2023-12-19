// document.body.style.backgroundColor='red'

let rand=()=>{ return Math.floor(Math.random()*10)}
let callBack=(a)=>{
    return new Promise((resolve,reject)=>{
        if(a>8){
            console.log("Hii " + a);
            reject("Rejected")
        }
        else {
            console.log("Hello");
            resolve("Resolvedhjbnmbjhn")
        }
    })
}

//

/* 
callBack(rand())
    .then((a)=>{
        console.log(a);
        callBack(rand())
            .then((a)=>{
                console.log(a);
                callBack(rand())
                    .then((a)=>{
                        console.log(a);
                        callBack(rand())
                            .then((a)=>{
                                console.log(a);
                            })
                            .catch((a)=>{
                                console.log(a);
                            })
                    })
                    .catch((a)=>{
                        console.log(a);
                    })
            })
            .catch((a)=>{
                console.log(a);
            })
    })
    .catch((a)=>{
        console.log(a);
    })
     */

    const apply =(color,delay)=>{
        return new Promise((resolve,reject)=>{
            setTimeout(()=>{
                if(color.length <10){
                        document.body.style.backgroundColor=color;
                        console.log("Color applied");
                        resolve(color);
                    }
                    else {
                    console.log("Color could not be applied");
                    reject(color +" rejected");

                }
            },delay)
        })

    }

    const color=async()=>{
        
    await apply('red',1000)
    .then(await apply('orange',1000))
    .then(await apply('yellow',1000))
    .then(await apply('green',1000))
    .then(await apply('blue',1000))
    .then(await apply('indigo',1000))
    .then(await apply('violet',1000))
    .then(await apply('maroonish-brown',1000))
    .catch((e)=>{
        console.log("Error in applying color" +e)
    })
    }
    color();