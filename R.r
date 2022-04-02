input <- file('stdin', 'r')
a <- as.integer(readLines(input, n=1))
b <- as.integer(readLines(input, n=1))

write(sprintf("%.3f",(b/12)*a),'')
