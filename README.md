# mini-data-encryption-system
Software: Eclipse Java Oxygen, Version: Oxygen.2 Release (4.7.2)
Programming Language: Java Language
Compiler: jdk-9.0.4

Step 1: Initialisation:
We have set the required elements corresponding to the English alphabets and space, dot, comma, ?,(,) making it z32

Step 2: Convert to binary:
In this, we have match the alphabet array with the each element of the plaintext, giving the corresponding element as output. Further, we convert the decimal to the binary value using the BitConversion()

Step 3: Convert String to Binary:

Step 3.a: Call padding(): We make sure that the binary value is a factor of 5 to divide in 5 bit string decrypted value

Step 3.b: Call binaryToStringConversion (): We take 5 binary_values at a time and parse these values in 2 block value. Further, we match the binary value with the corresponding element stored in the array and return the corresponding alphabet value for it.
This is returned as a string value.
