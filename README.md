A DFDL schema showing how a check-digit can be verified on parse and recomputed on unparse.

The check digit is the result of taking all digits 0-9 of the layer data, adding them together, and taking only the least-significant digit of the resulting sum. 

So for 10:22:18.234 The sum is 23, so the check-digit is 3. 

