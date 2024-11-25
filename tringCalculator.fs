module StringCalculator

let add (numbers: string) =
    match numbers with
    | "" -> 0
    | _ when numbers.StartsWith("//") ->
        let delimiterEnd = numbers.IndexOf('\n')
        let customDelimiter = numbers.[2..delimiterEnd-1]
        let numbersPart = numbers.[delimiterEnd+1..]
        let parts = numbersPart.Split([| customDelimiter |], System.StringSplitOptions.None)
        parts |> Array.map int |> Array.filter (fun x -> x <= 1000) |> Array.sum
    | _ ->
        let delimiters = [| ','; '\n' |]
        let parts = numbers.Split(delimiters)
        parts |> Array.map int |> Array.filter (fun x -> x <= 1000) |> Array.sum

// Pruebas
printfn "%d" (add "//[***]\n1***2***3") // 6
















