# Sample input lists
list1 = [1, 2, 3, 4, 5, 6]
list2 = [7, 8, 9, 10, 11, 12]

# Filter odd numbers from list1
odd_from_list1 = [num for num in list1 if num % 2 != 0]

# Filter even numbers from list2
even_from_list2 = [num for num in list2 if num % 2 == 0]

# Combine the two filtered lists
new_list = odd_from_list1 + even_from_list2

print("New list:", new_list)
