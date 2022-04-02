import Text.Printf(printf)

main :: IO ()
main = do
    a <- readLn
    b <- readLn
    printf "%.3f\n" ((b/12.0) * a :: Double)
