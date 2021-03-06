package bin.fract;

/*
The MIT License (MIT)
Copyright (c) 2017 Kinga Makowiecka

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation file
(the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge,
publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do
so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE
FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
*/

public class App {
    public static void main(String[] args) {
        MathPower mathPower = new MathPower();
        Converter converter = new Converter(mathPower.getPowersOfTwo());

        String binaryFraction = "0.100101";
        System.out.println("Binary fraction: " + binaryFraction +
                " is equal to decimal fraction: " + converter.convertToDecimal(binaryFraction).toString());

        double decimalFraction = 0.578125;
        System.out.println("Decimal fraction: " + decimalFraction +
                " is equal to binary fraction: " + converter.convertToBinary(decimalFraction));

    }
}
