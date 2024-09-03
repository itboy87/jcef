import os
import sys

substitution_list = [
    ("org.slf4j.", "org.apache.thrift."),
    ("org.apache.thrift", "com.jetbrains.cef.remote.thrift")
]


def patch_file(file_path):
    with open(file_path, "rt") as f:
        content = f.read()

    for substitution in substitution_list:
        content = content.replace(substitution[0], substitution[1])

    with open(file_path, "wt") as f:
        f.write(content)


if __name__ == "__main__":
    print("Running " + " ".join(sys.argv))
    if len(sys.argv) != 2:
        print("The script patches the interfaces generated by the thrift compiler to be compatible with JCEF project.\n"
              "Takes only one argument - the path to the directory.")
        exit()

    for path, _, files in os.walk(sys.argv[1]):
        for file in files:
            patch_file(os.path.join(path, file))
