import re

with open('расписание_json.txt', encoding='utf-8') as file:
    lines = file.readlines()


def parse_json(json_obj):
    for i in range(len(json_obj)):
        line = json_obj[i]
        line = line.replace("\n", "")   # убираем перенос строки
        line = line.replace("    ", "", 1)  # убираем лишние отступы
        line = line.replace('"', '')    # убираем кавычки
        line = line.replace(",", "")    # убираем запятые

        line = re.sub(r'\s*\{', "", line)
        line = re.sub(r'\s*\}', "", line)
        line = re.sub(r'\s+:\s*', ': ', line)

        if line != "":
            print(line)


parse_json(lines)