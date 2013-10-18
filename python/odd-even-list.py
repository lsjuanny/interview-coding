#! /usr/bin/env python
# -*- coding: iso-8859-15 -*-
import sys

var = sys.argv[1:]
print var

i = 0
j = len(var)-1



while i < j:
	if int(var[i])%2 == 1:
		i=i+1
		continue
	else:
		if int(var[j])%2 == 0:
			j=j-1
			continue
		else:
			x=var[i]
			var[i]=var[j]
			var[j]=x

print var
