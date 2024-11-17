from re import *

def find_smiles(pattern, string):
    match_pattern = findall(pattern, string)
    print("Количество смайликов в исходной строке: ", len(match_pattern))


smile = r'8\<\{\|'

test1 = "fsdakjf8sd<{sd|8<{|sdsd8<{|qwqws880<{|dfdf8<{|8<{|sdsdakl"                       #4
test2 = "Вот пример смайлика: 8<{| и еще один 8<{|."                                      #2
test3 = "!@#$%^&*()_+8<{|~`<>?;:'\"8<{|{!@#$%}[]|\\8<{|%^&*()_+8"                         #3
test4 = "Here the text without smiles... It's sad text."                                  #0
test5 = "Сегодня мы найдем 8<{| а еще 8<{|8<{|8<{|. 8<{8<{||8<{8<{8<8<{|{||8<{||"         #7

find_smiles(smile, test1)
find_smiles(smile, test2)
find_smiles(smile, test3)
find_smiles(smile, test4)
find_smiles(smile, test5)