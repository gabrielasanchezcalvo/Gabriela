module StringCalculator

let add (numbers: string) =
    match numbers with
    | "" -> 0
    | _ ->
        let delimiters = [| ','; '\n' |]
        let parts = numbers.Split(delimiters)
        parts |> Array.map int |> Array.sum

// Pruebas
printfn "%d" (add "1\n2,3") // 6


















