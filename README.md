
1. Explain Java 8 Streams ?
Java 8 Streams lets you process the data in a declarative way and streams can leverage multi-core architectures without you having to write a single line of multithread code.

2. Stream does not store elements. It simply conveys elements from a source such as a data structure, an array, or an I/O channel, through a pipeline of operations.

3. Operations performed on a stream does not modify it's source. For example, filtering a Stream obtained from a collection produces a new Stream with the filtered elements.

4. Stream is lazy and evaluates code only when required.

5. Streams are more declarative style or more expressive.
   ```
   Example : 
            getJuniors(){
              return employees.Stream()
                              .filter(employee -> employee.getRole().equals("Junior Engineer"))
                              .collect(Collectors.toList());
            }
            ```
6. Stream encourages less mutability i.e not using multiple variables assignment during computation eventually reduces the side effect.

7. There are different types of Streams ->
Sequential , Parallel.
```
Example : 
            getJuniors(){
              return employees.Stream()
                              .filter(employee -> employee.getRole().equals("Junior Engineer"))
                              .collect(Collectors.toList());
            }

Example : 
            getJuniorsUsingParallelStream(){
              return employees.parallel()
                              .filter(employee -> employee.getRole().equals("Junior Engineer"))
                              .collect(Collectors.toList());
            }
          
   ```           
8. The elements of a stream are only visited ONCE during the life of a stream. Like an Iterator, a new stream must be re-generated to revisit the same elements of the source.
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
