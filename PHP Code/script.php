<?php

class Yates {
	public function shuffle($array){
		$boundary = count($array) - 1;

		while($boundary != 0){
			$baseIndex = $boundary;
			$newIndex = random_int(0, $boundary-1);
			$array = $this -> switchElements($array, $baseIndex, $newIndex);
			--$boundary;
		}
		return $array;
	}

	private static function switchElements($array, $baseIndex, $newIndex){
		$newIndexValue = $array[$baseIndex];
		$array[$baseIndex] = $array[$newIndex];
		$array[$newIndex] = $newIndexValue;
		return $array;
	}
}

$arrayTest = array("Hello", "my", "name", "is",
         "Handy", "Joe", "and", "welcome",
         "to", "Jackass");
$yates = new Yates();
print_r($yates->shuffle($arrayTest));
