### FizzBuzz

---

## step1
branch: FizzBuzz-step1

_initial implementation_

Write code that produces the following output for each number in a contiguous range of integers:

1. the number itself
2. "fizz" for numbers that are multiples of 3
3. "buzz" for numbers that are multiples of 5
4. "fizzbuzz" for numbers that are multiples of 15

Being careful to avoid trailing spaces.

e.g. running the program with a __range__ from 1-20 should produce the following result:
```
1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzzs
```
Init a local git repository and create a commit with the solution

## step2
branch: FizzBuzz-step2

_alfresco variation_

Please enhance your existing FizzBuzz solution to perform the following:

If the number contains a three you must output the text ‘alfresco’, any other rule is skipped.

e.g. running the program with a range from 1-20 should produce the following result:
```
1 2 alfresco 4 buzz fizz 7 8 fizz buzz 11 fizz alfresco 14 fizzbuzz 16 17 fizz 19 buzz
```

Create a branch for the alfresco variation and then a commit with the solution.

## step3
branch: FizzBuzz-step3

_alfresco variation with report_

Produce a report at the end of the output showing how many times the following were printed:

* fizz
* buzz
* fizzbuzz
* alfresco
* integer

e.g. Running the program with a range from 1-20 should produce the following result:
```
1 2 alfresco 4 buzz fizz 7 8 fizz buzz 11 fizz alfresco 14 fizzbuzz 16 17 fizz 19 buzz
fizz: 4 buzz: 3 fizzbuzz: 1 alfresco: 2 integer: 10
```

_(Integer is 10 because there were 10 numbers in the output that were not altered)._

## step4
branch: FizzBuzz-step4

_RESTful API_

Wrap this in a RESTful API for a fizzbuzz integer range resource using Spring Boot or any other technology you are familiar with, and create an integration test for a successful run and for an invalid input, for example a string rather than a number.

#### run the tests:
```shell
mvn test
```


## step5
branch: FizzBuzz-step5

Create a docker image with your REST API server and launch a container, then execute the same integration test as in Step 4.

```shell
mvn package
docker build -t fizzbuzz .
docker run --rm -it -p8080:8080 fizzbuzz
```


## step6
branch: FizzBuzz-step6

Full Stack bonus! Create a simple JavaScript user interface providing a form for the input number calling the REST API and printing the result without page reload.

#### web app:
Please open the __index.html__ file in the __web__ folder.



