#！ /bin/sh
s="nihsoa *"
VAR1="DONG  *"
VAR=$VAR1
echo $VAR
VAR=${VAR1}
echo $VAR
VAR="$VAR1"
echo $VAR
VAR="${VAR1}"
echo "$VAR"
echo "------"
echo "$s$VAR"

readonly NAME="Zara Ali"
echo $NAME