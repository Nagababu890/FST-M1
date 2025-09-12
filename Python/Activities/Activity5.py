# Ask the user for the number
n = int(input("Input a number: "))

# Generate multiplication table from 1 to 10
for i in range(1, 11):
    print(n, 'x', i, '=', n * i)
