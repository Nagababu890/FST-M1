try:
    print(x) # This variable is not defined, so it causes NameError
except NameError:
    print("x hasn't been defined yet.")