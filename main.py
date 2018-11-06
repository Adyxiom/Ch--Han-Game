from random import randint
import time


def main():
    n = int(input("Enter the dice range : "))
    i = int(input("Enter the number of plays : "))
    start_time = time.time()
    even = {2}
    j = 1
    totalp = 0
    totali = 0
    compteur = 1
    while compteur <= n:
        even.add(compteur*2)
        compteur += 1
    while j <= i:
        d1 = randint(1, n)
        d2 = randint(1, n)
        d = d1 + d2
        if d in even:
            print(str(j)+".", "d =", d, ": PAIRE")
            totalp += 1
        else:
            print(str(j)+".", "d =", d, ": IMPAIRE")
            totali += 1
        j+=1
    print("--------------------------------------------")
    print("Total of even :", totali)
    print("Total of odd :", totalp)
    moyenne = (totalp / (totalp + totali)) * 100
    print(str(moyenne)+"%", "of even.")
    if time.time() - start_time > 60:
        print("--- %s minutes ---" % (time.time() - start_time) / 60)
    else:
        print("--- %s seconds ---" % (time.time() - start_time))


if __name__ == '__main__':
    main()

