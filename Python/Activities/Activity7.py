# Ask the user to enter numbers separated by commas
input_str = input("Enter numbers separated by commas: ")

# Convert the string input into a list of integers
num_list = [int(num.strip()) for num in input_str.split(",")]

# Calculate the sum of the list elements
total_sum = sum(num_list)

# Print the result
print("Sum of all elements:", total_sum)
