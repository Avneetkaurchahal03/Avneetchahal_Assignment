let text=["Hello", "World", "in", "a", "frame"];
function Split(str) {
    let arr = [];
    arr = str.split("\n");
    for (let index = 0; index < 1; index++) {
     document.write("*******");
      for (let j = 0; j <= arr.length; j++) {
       arr == arr[j].split(",");
       document.write("*" + arr[j] + "*" );
      }
    }
    document.write("******");
    return arr;
  }
  document.write(Split(text));