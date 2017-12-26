# Java8streams

Explain Java 8 Streams ?

1. Java provides a new additional package in Java 8 called java.util.stream.This package consists of classes, interfaces and enum to allows functional-style operations on the elements.

2. Stream does not store elements. It simply conveys elements from a source such as a data structure, an array, or an I/O channel, through a pipeline of operations.

3. Operations performed on a stream does not modify it's source. For example, filtering a Stream obtained from a collection produces a new Stream with the filtered elements.

4. Stream is lazy and evaluates code only when required.

5. The elements of a stream are only visited ONCE during the life of a stream. Like an Iterator, a new stream must be re-generated to revisit the same elements of the source.
```
        List<Employee> employeeList = Arrays.asList(
                new Employee("John", 25, "CAP", new BigDecimal(4000.00)),
                new Employee("David", 25, "CAP", new BigDecimal(5000.00)),
                new Employee("Mark", 30, "CAP", new BigDecimal(5000.00)),
                new Employee("Alice", 32, "CAP", new BigDecimal(6000.00)),
                new Employee("Tim", 35, "CAP", new BigDecimal(7000.00))
        );
        
        Stream<Employee> employeeListStream = employeeList.stream();
        employeeListStream
                          .map(employee -> employee.getName())
                          .forEach(System.out::println);
        
        // Will result in java.lang.IllegalStateException: stream has already been operated upon or closed
        employeeListStream
                          .map(employee -> employee.getName())
                          .forEach(System.out::println);
```
6. Streams are more declarative style or more expressive.
```
   Example : 
            getJuniors(){
              return employees.Stream()
                              .filter(employee -> employee.getRole().equals("Junior Engineer"))
                              .collect(Collectors.toList());
            }
```
7. Stream encourages less mutability i.e not using multiple variables assignment during computation eventually reduces the side effect.

8. There are two types of Streams -> 
```
Sequential , Parallel.
```


