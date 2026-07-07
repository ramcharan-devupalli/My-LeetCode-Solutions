class Solution(object):
    def sumAndMultiply(self, n):
        str_x = str(n).replace("0" ,'')
        if not str_x:
            return 0
        x = int(str_x)
        print(x)
        digit_sum = 0
        for digit in str_x:
            digit_sum += int(digit)
        return digit_sum * x