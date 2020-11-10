package main

import (
	"fmt"
)

func main() {
	var a, b int
	fmt.Scan(&a)
	fmt.Scan(&b)
	var result float64 = (float64( b ) / 12.0) * float64(a)
	fmt.Printf("%.3f\n", result)
}
