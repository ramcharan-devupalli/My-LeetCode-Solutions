import keyword

def is_valid_variable(name):
    return isinstance(name, str) and name.isidentifier() and not keyword.iskeyword(name)