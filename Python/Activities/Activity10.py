
input_nums = input("Enter 5 numbers, separated by commas: ")

# Create list
num_list = input_nums.split(",")

# Create tuple
num_tuple = tuple(num_list)

print("Numbers divisible by 5:")
for num in num_tuple:
    if int(num.strip()) % 5 == 0:   # Remove whitespace before converting
        print(num.strip())

