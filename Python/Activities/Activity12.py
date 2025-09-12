def recursive_sum(n):
    if n == 0:
        return 0
    else:
        return n + recursive_sum(n - 1)

# Calculate sum from 0 to 10
result = recursive_sum(20)
print("Sum of numbers from 0 to 20 is:", result)
