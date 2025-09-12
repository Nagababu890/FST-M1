import pandas as pd 
data = {
    "Usernames": ["admin", "echo", "charlie"],
    "Passwords": ["new", "bege", "ender"]
}
df = pd.DataFrame(data)
df.to_csv("./Activity/sample.csv", index=False)
input_data = pd.read_csv("./Activity/sample.csv")

# Print Usernames column
print(input_data["Usernames"])

# Print the second username and all passwords
print(input_data["Usernames"][1], input_data["Passwords"])

# Print the full data
print("Full Data: ")
print(input_data)

# Print the values in the Usernames column only
print("===============")
print("Usernames:")
print(input_data["Usernames"])

# Print the username and password of the second row
print("===============")
print("Username: ", input_data["Usernames"][1], " | ", "Password: ", input_data["Passwords"][1])

# Sort the Usernames column in ascending order
print("====================================")
print("Data sorted in ascending Usernames:")
print(input_data.sort_values('Usernames'))

# Sort the Passwords column in descending order
print("====================================")
print("Data sorted in descending Passwords:")
print(input_data.sort_values('Passwords', ascending=False))
