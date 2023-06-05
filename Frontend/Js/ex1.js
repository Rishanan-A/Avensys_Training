

let c = [1003, "onetwothree", "true", "good afternoon", 999990, false, null, NaN]
let a = [1001, "one", true, "hello"]

let x = a.reduce ((a) =>{
return a=="hello"
})
console.log(x)
console.log(a)