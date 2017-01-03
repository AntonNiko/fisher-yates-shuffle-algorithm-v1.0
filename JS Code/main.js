class Yates {

  constructor(array){
    this.array = array;
    this.array = this.shuffle();
    return this.array;
  }

  shuffle(){
    var array = this.array;
    var boundary = array.length-1;

    while(boundary != 0){
      var baseIndex = boundary;
      var newIndex = Math.floor(Math.random() * boundary);

      array = this.switchElements(array, baseIndex, newIndex);
      --boundary;
    }
    return array;
  }

  switchElements(array, baseIndex, newIndex){
    var newIndexValue = array[baseIndex];

    array[baseIndex] = array[newIndex];
    array[newIndex] = newIndexValue;
    return array;
  }

}

var arrayNew1 = new Yates(["alpha","beta","gamma","delta","epsilon","zeta"]);
var arrayNew2 = new Yates([20,21,22,23,24,25,26,27,28,29,30])
console.log(arrayNew1);
console.log(arrayNew2);
