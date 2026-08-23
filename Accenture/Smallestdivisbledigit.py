def smallestNumber(self, n: int, t: int) -> int:
        while True:
            num = n
            product = 1

            while num > 0:
                product *= num % 10
                num //= 10

            if product % t == 0:
                return n

        return None