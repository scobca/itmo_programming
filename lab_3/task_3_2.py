import json
import yaml

with open('расписание_json.txt', encoding='utf-8') as json_obj:
    data = json.load(json_obj)

yaml_obj = yaml.dump(data, default_flow_style=False, allow_unicode=True)

print(yaml_obj)