with open('расписание_json.txt', encoding='utf-8') as file:
    lines = file.readlines()


def parse_json(json_obj):
    for i in range(len(json_obj)):
        line = json_obj[i]
        line = line.replace("\n", "")   # убираем перенос строки
        line = line.replace("    ", "", 1)  # убираем лишние отступы
        line = line.replace('"', '')    # убираем кавычки
        line = line.replace(",", "")    # убираем запятые
        line = line.replace(" :", ":")  # убираем лишние пробелы перед двоеточиями

        line = line.replace('        {', "")
        line = line.replace('        }', "")
        line = line.replace('{', "")
        line = line.replace('}', "")

        if line != "":
            print(line)


parse_json(lines)