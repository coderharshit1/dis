ArrayList<Integer> numbersList 
    = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));
  
List<Integer> listWithoutDuplicates = numbersList.stream()
            .distinct()
            .collect(Collectors.toList());
  
System.out.println(listWithoutDuplicates);