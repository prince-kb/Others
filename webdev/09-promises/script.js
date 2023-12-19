const callBack=(url,success,failure)=>{
    const delay=Math.floor(Math.random() * 3000)+1000;
    setTimeout(()=>{
        if(delay<3000){
            success(url + " worked")
        }
        else failure("Failure")
    },500)
}

//Callback hell

/* callBack('hii.com',()=>{
    console.log("Worked")
    callBack('hii.com',()=>{
        console.log("Worked(1)")
        callBack('hii.com',()=>{
            console.log("Worked(2)")
            callBack('hii.com',()=>{
                console.log("Worked(3)")
            },()=>{
                console.log("It didn't worked(3)")
            });
        },()=>{
            console.log("It didn't worked(2)")
        });
    },()=>{
        console.log("It didn't worked(1)")
    });
},()=>{
    console.log("It didn't worked")
}); */

let i=0

//Callback hell using Promise
const promiseCallBack=(url)=>{
    return new Promise((success,reject)=>{
        const delay = Math.floor(Math.random()*4000)+1000;
        setTimeout(()=>{
            if(delay < 4000){
                success(url +" fetched")
            }
            else {
                reject(url +" cannot  be fetched")
            }
        },500)
    })
}

//using nested then and catch for promises
//But it also makes the code comple and difficult to understand

/*
promiseCallBack(`hello${i++ }`)
    .then((hii)=>{
        console.log(`SUCCESS ${i} \n`+ hii)
        promiseCallBack(`hello${i++}`)
        .then((hii)=>{
            console.log(`SUCCESS ${i} \n`+ hii)
            promiseCallBack(`hello${i++}`)
                .then((hii)=>{
                    console.log(`SUCCESS ${i} \n`+ hii)   
                    promiseCallBack(`hello${i++}`)
                        .then((hii)=>{
                            console.log(`SUCCESS ${i} \n`+ hii)
                            })
                        .catch((hii)=>{
                            console.log(`REJECTED ${i} \n`+hii)
                        })                 
                    })
                .catch((hii)=>{
                    console.log(`REJECTED ${i} \n`+hii)
                })
            })
        .catch((hii)=>{
            console.log(`REJECTED ${i} \n`+hii)
        })        
    })
    .catch((hii)=>{
        console.log(`REJECTED ${i} \n`+hii)
    })
*/


//This is a simpler version of what we have done previously 
//This is simpler
//But the drawback here is we can only use one catch type
    promiseCallBack(`hello${i++}`)
    .then((hii)=>{
        console.log(`SUCCESS ${i} \n`+ hii)

        //Mandatory line for a simpler promise calling
        return  promiseCallBack(`hello${i++}`)
    })
    .then((hii)=>{
        console.log(`SUCCESS ${i} \n`+ hii)
        return  promiseCallBack(`hello${i++}`)
    })
    .then((hii)=>{
        console.log(`SUCCESS ${i} \n`+ hii)
        return  promiseCallBack(`hello${i++}`)
    })
    .then((hii)=>{
        console.log(`SUCCESS ${i} \n`+ hii)
        return  promiseCallBack(`hello${i++}`)
    })
    .then((hii)=>{
        console.log(`SUCCESS ${i} \n`+ hii)
        return  promiseCallBack(`hello${i++}`)
    })
    .then((hii)=>{
        console.log(`SUCCESS ${i} \n`+ hii)
        return  promiseCallBack(`hello${i++}`)
    })
    .catch((hii)=>{
        console.log(`REJECTED ${i} \n`+hii)
    })